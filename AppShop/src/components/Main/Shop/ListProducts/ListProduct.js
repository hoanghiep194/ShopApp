import React, { Component } from 'react';
import { StyleSheet, Text, View, TouchableOpacity, Image, Dimensions, ScrollView } from 'react-native';
import {HomeViewScreen} from '../../../../../screenNames';

const { height, width } = Dimensions.get('window');

export default class ListProduct extends Component {
    render() {

        const { container, wrapcontent, header, image, textStyle,
            productContainer, productImage, productInfo,
            txtName, txtPrice, txtMaterial, txtColor, txtShowDetail, lastRowInfo } = styles;
        return (
            <View style={container}>
                <ScrollView style={wrapcontent}>
                    <View style={header}>
                        <TouchableOpacity
                            onPress={()=> {
                                this.props.navigation.navigate(HomeViewScreen);
                            }}
                        >
                            <Image
                                source={require('../../../../icon/backList.png')}
                                style={image}
                            />
                        </TouchableOpacity>
                        <Text style={textStyle}>Part Dress</Text>
                        <View style={{ width: 40 }} />
                    </View>
                    <View style={productContainer}>
                        <Image
                            source={require('../../../../images/sp1.jpeg')}
                            style={productImage}
                        />
                        <View style={productInfo}>
                            <Text style={txtName}>Lace Sleeve Si</Text>
                            <Text style={txtPrice}>117$</Text>
                            <Text style={txtMaterial}>Material silk</Text>
                            <View style={lastRowInfo}>
                                <Text style={txtColor}>Color Royal Blue</Text>
                                <View style={{ backgroundColor: 'cyan', height: 15, width: 15, borderRadius: 7 }}></View>
                                <TouchableOpacity>
                                    <Text style={txtShowDetail}>Show Detail</Text>
                                </TouchableOpacity>
                            </View>
                        </View>
                    </View>
                </ScrollView>
            </View>
        );
    }
}

const imageWidth = (width - 200) / 2;
const imageHeight = (imageWidth / 361) * 452;

const styles = StyleSheet.create({
    container: {
        backgroundColor: '#DBDBD8',
        flex: 1,
        padding: 10
    },
    wrapcontent: {
        backgroundColor: '#fff',
        shadowColor: 'black',
        shadowOffset: { width: 0, height: 2 },
        shadowOpacity: 0.8,
        padding: 10

    },
    header: {
        flexDirection: 'row',
        justifyContent: 'space-between',
        alignItems: 'center',
        marginBottom: 5
    },
    image: {
        width: 30,
        height: 30
    },
    textStyle: {
        fontFamily: 'Avenir',
        color: '#B10D65',
        fontSize: 20
    },
    productContainer: {
        flexDirection: 'row',
        paddingVertical: 10,
        borderTopColor: '#F0F0F0',
        borderBottomColor: '#fff',
        borderLeftColor: '#fff',
        borderRightColor: '#fff',
        borderWidth: 1
    },
    productImage: {
        height: imageHeight,
        width: imageWidth
    },
    productInfo: {
        marginLeft: 10,
        justifyContent: 'space-between',
        flex: 1
    },
    lastRowInfo: {
        flexDirection: 'row',
        justifyContent: 'space-between',
        alignItems: 'center'
    },
    txtName: {
        fontFamily: 'Avenir',
        color: '#BCBCBC',
        fontSize: 17,
        fontWeight: '400'
    },
    txtPrice: {
        fontFamily: 'Avenir',
        color: '#B10D65',
    },
    txtMaterial: {
        fontFamily: 'Avenir',
    },
    txtColor: {
        fontFamily: 'Avenir',
    },
    txtShowDetail: {
        fontFamily: 'Avenir',
        color: '#B10D65',
    }
});