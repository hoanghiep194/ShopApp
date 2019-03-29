import React, {Component} from 'react';
import {StyleSheet, Text, View, ImageBackground, Dimensions} from 'react-native';
import Swiper from 'react-native-swiper';



const { height, width } = Dimensions.get('window');

export default class Category extends Component {

    render() {

        const { wrapper, imageStyle, textStyle, textImage } = styles;

        return(
            <View style={wrapper}>
                <View style={{flex: 1, justifyContent:'center'}}>
                    <Text style={textStyle}>SPRING COLLECTION</Text>
                </View>
                <View style={{flex: 3}}>
                    <Swiper autoplay={true}>
                        <ImageBackground 
                            source={require('../../../../images/little.jpg')}
                            style={imageStyle}>
                            <Text style={textImage}>Little Dress</Text>
                        </ImageBackground>
                        <ImageBackground 
                            source={require('../../../../images/maxi.jpg')}
                            style={imageStyle}>
                            <Text style={textImage}>Maxi Dress</Text>
                        </ImageBackground>
                        <ImageBackground 
                            source={require('../../../../images/party.jpg')}
                            style={imageStyle}>
                            <Text style={textImage}>Party Dress</Text>
                        </ImageBackground>
                    </Swiper>
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
        width: imageWidth,
        alignItems: 'center',
        justifyContent: 'center'
    },
    textStyle: {
        fontSize: 20,
        color: '#AFAEAF'
    },
    textImage: {
        fontSize: 15,
        color: '#AFAEAF'
    }
});