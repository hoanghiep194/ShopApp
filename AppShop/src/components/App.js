/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {StyleSheet, Text, View, StatusBar, Dimensions} from 'react-native';
import {createAppContainer, createDrawerNavigator, createBottomTabNavigator} from 'react-navigation';

import Main from './Main/Main';

import Authentication from './Authentication/Authentication';
import ChangeInfo from './ChangeInfo/ChangeInfo';
import OrderHistory from './OrderHistory/OrderHistory';

import Shop from './Main/Shop/Shop';
import Cart from './Main/Shop/Cart/Cart';
import Search from './Main/Shop/Search/Search';
import Contact from './Main/Shop/Contact/Contact';

import {MainScreen1, AuthenticationScreen, ChangeInfoScreen, OrderHistoryScreen, 
    HomeTab, CartTab, SearchTab, ContactTab } from '../../screenNames';

StatusBar.setHidden(true);
var {height,width} = Dimensions.get('window');

let routeTabConfigs = {
    HomeTab: {
        screen: Shop
    },
    CartTab: {
        screen: Cart
    },
    SearchTab: {
        screen: Search
    },
    ContactTab: {
        screen: Contact
    }
}

let tabNavigatorConfig = {
    tabBarPosition: 'bottom',
    animationEnabled: true,
    swipeEnabled: true,
}

const tabBar = createBottomTabNavigator(routeTabConfigs,tabNavigatorConfig);


let routeConfigs = {
    MainScreen1: {
        screen: tabBar
    },
    AuthenticationScreen: {
        screen: Authentication
    },
    ChangeInfoScreen: {
        screen: ChangeInfo
    },
    OrderHistoryScreen: {
        screen: OrderHistory
    }
}

let drawerNavigatorConfig = {
    initialRouteName: MainScreen1,
    drawerWidth: width / 2,
    drawerPosition: 'left'
}

const MyDrawerNavigator = createDrawerNavigator(routeConfigs,drawerNavigatorConfig);

const App = createAppContainer(MyDrawerNavigator);

export default App;
