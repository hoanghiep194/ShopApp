import React, { Component } from 'react';
import { StyleSheet, Text, View, Image, Dimensions, ListView , FlatList} from 'react-native';
import Swiper from 'react-native-swiper';





const { height, width } = Dimensions.get('window');

export default class TopProduct extends Component {

    // constructor(props) {
    //     super(props);
    //     this.state = {
    //         dataSource: new ListView.DataSource({ rowHasChanged: (r1, r2) => r1 !== r2 })
    //     };
    // }

    // componentDidMount() {
        
    //     const { topProduct } = this.props;
    //     this.setState({
    //         dataSource: this.state.dataSource.cloneWithRows(topProduct)
    //     })
    // }

    render() {
        const url = `http://10.1.10.166/Images/`;
        const { wrapper, imageStyle, textStyle, body, productContainer, nameStyle, priceStyle } = styles;
        console.log(this.props.topProduct);
        return (
            <View style={wrapper}>
                <View style={{ justifyContent: 'center', height: 50 }}>
                    <Text style={textStyle}>TOP PRODUCT</Text>
                </View>

                <ListView 
                    contentContainerStyle={body}
                    dataSource={new ListView.DataSource({ rowHasChanged: (r1, r2) => r1 !== r2 }).cloneWithRows(this.props.topProduct)}
                    renderRow={item => (
                        <View style={productContainer}>
                        <Image
                            source={{uri: `${url}${item.images.split(',')[0]}`}}
                            style={imageStyle}
                        />
                        <Text style={nameStyle}>{item.name.toUpperCase()}</Text>
                        <Text style={priceStyle}>{item.price}$</Text>
                    </View>
                    )}
                />
            </View>
        );
    }
}

const imageWidth = (width - 50) / 2;
const imageHeight = (imageWidth / 361) * 452;


const styles = StyleSheet.create({
    wrapper: {
        backgroundColor: '#fff',
        margin: 10,
        shadowColor: '#2E272B',
        shadowOffset: { width: 0, height: 3 },
        shadowOpacity: 0.2,
        paddingTop: 0
    },
    body: {
        flexDirection: 'row',
        justifyContent: 'space-around',
        flexWrap: 'wrap'
    },
    imageStyle: {
        height: imageHeight,
        width: imageWidth
    },
    textStyle: {
        fontSize: 20,
        color: '#AFAEAF'
    },
    productContainer: {
        width: imageWidth,
        shadowColor: '#2E272B',
        paddingBottom: 20,
        shadowOffset: { width: 0, height: 3 },
        shadowOpacity: 0.2
    },
    nameStyle: {
        paddingLeft: 10,
        fontFamily: 'Avenir',
        color: '#D3D3DF'
    },
    priceStyle: {
        paddingLeft: 10,
        fontFamily: 'Avenir',
        color: '#662F90'
    }
});