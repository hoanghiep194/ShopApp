import React, {Component} from 'react';
import {StyleSheet, Text, ScrollView, Image} from 'react-native';
import Collection from './Collection';
import Category from './Category';
import TopProduct from './TopProduct';


export default class HomeView1 extends Component {

    render() {

        return(
            <ScrollView style={{backgroundColor:'#DBDBD8', flex: 1}}>
                <Collection/>
                <Category productType={this.props.screenProps.productType}/>
                <TopProduct topProduct={this.props.screenProps.topProduct}/>
            </ScrollView>
        );
    }
}