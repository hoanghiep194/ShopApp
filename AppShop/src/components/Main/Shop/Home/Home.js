import React, { Component } from 'react';
import { StyleSheet, Text, ScrollView, Image, View } from 'react-native';
import { createStackNavigator, createAppContainer } from 'react-navigation';
// import Collection from './Collection';
// import Category from './Category';
// import TopProduct from './TopProduct';
import HomeView1 from './HomeView1';
import TopProduct from '../Home/TopProduct';

export default class Home extends Component {

    render() {
        return (
            <HomeNavigtor screenProps={{productType: this.props.productType, topProduct: this.props.topProduct}}/>
        );
    }
}

const routeConfigs = {
    HomeViewScreen: {
        screen: HomeView1
    },
    TopProductScreen: {
        screen: TopProduct
    }
}

const navigatorConfigs = {
    headerMode: 'none'
}

const navigator = createStackNavigator(routeConfigs, navigatorConfigs);
const HomeNavigtor = createAppContainer(navigator);
