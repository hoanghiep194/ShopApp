import React, {Component} from 'react';
import {StyleSheet, Text, View, Image, Dimensions} from 'react-native';




const { height, width } = Dimensions.get('window');

export default class Collection extends Component {

    render() {

        const { wrapper, imageStyle, textStyle } = styles;

        return(
            <View style={wrapper}>
                <View style={{flex: 1, justifyContent:'center'}}>
                    <Text style={textStyle}>SPRING COLLECTION</Text>
                </View>
                <View style={{flex: 3}}>
                    <Image 
                        source={require('../../../../images/banner.jpg')}
                        style={imageStyle}
                    />
                </View>

            </View>
        );
    }
}

const imageWidth = width - 40;
const imageHeight = (imageWidth / 933) * 490;


const styles = StyleSheet.create({
    wrapper: {
        height: height * 0.3,
        backgroundColor: '#fff',
        margin: 10,
        shadowColor: '#2E272B',
        shadowOffset: {width: 0, height: 3},
        shadowOpacity: 0.2,
        padding: 10,
        paddingTop: 0,
        marginBottom: 0
    },
    imageStyle: {
        height: imageHeight,
        width: imageWidth
    },
    textStyle: {
        fontSize: 20,
        color: '#AFAEAF'
    }
});