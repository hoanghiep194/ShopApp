import React, {Component} from 'react';
import {StyleSheet, Text, ScrollView, Image} from 'react-native';
import Collection from './Collection';
import Category from './Category';
import TopProduct from './TopProduct';

export default class Home extends Component {

    render() {
        return(
            <ScrollView style={{backgroundColor:'#DBDBD8', flex: 1}}>
                <Collection/>
                <Category/>
                <TopProduct/>
            </ScrollView>
        );
    }
}