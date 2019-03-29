import React, {Component} from 'react';
import {StyleSheet, Text, View, Image, Dimensions} from 'react-native';
import Swiper from 'react-native-swiper';



const { height, width } = Dimensions.get('window');

export default class TopProduct extends Component {

    render() {

        const { wrapper, imageStyle, textStyle, body, productContainer, nameStyle, priceStyle } = styles;

        return(
            <View style={wrapper}>
                <View style={{justifyContent:'center', height: 50}}>
                    <Text style={textStyle}>TOP PRODUCT</Text>
                </View>
                <View style={body}>
                    <View style={productContainer}>
                        <Image 
                            source={require('../../../../images/sp1.jpeg')}
                            style={imageStyle}
                        />
                        <Text style={nameStyle}>Product Name</Text>
                        <Text style={priceStyle}>250$</Text>
                    </View>
                    <View style={productContainer}>
                        <Image 
                            source={require('../../../../images/sp2.jpeg')}
                            style={imageStyle}
                        />
                        <Text style={nameStyle}>Product Name</Text>
                        <Text style={priceStyle}>340$</Text>
                    </View>
                    <View style={{height: 10, width}}></View>
                    <View style={productContainer}>
                        <Image 
                            source={require('../../../../images/sp3.jpeg')}
                            style={imageStyle}
                        />
                        <Text style={nameStyle}>Product Name</Text>
                        <Text style={priceStyle}>700$</Text>
                    </View>
                    <View style={productContainer}>
                        <Image 
                            source={require('../../../../images/sp4.jpeg')}
                            style={imageStyle}
                        />
                        <Text style={nameStyle}>Product Name</Text>
                        <Text style={priceStyle}>360$</Text>
                    </View>
                </View>
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
        shadowOffset: {width: 0, height: 3},
        shadowOpacity: 0.2,
        paddingTop: 0
    },
    body:{
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
        shadowOffset: {width: 0, height: 3},
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