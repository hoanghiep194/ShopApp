/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {StyleSheet, Text, View, StatusBar, Dimensions} from 'react-native';
import {createAppContainer, createDrawerNavigator} from 'react-navigation';

import Authentication from '../Authentication/Authentication';
import ChangeInfo from '../ChangeInfo/ChangeInfo';
import OrderHistory from '../OrderHistory/OrderHistory';

import {AuthenticationScreen, ChangeInfoScreen, OrderHistoryScreen} from '../../../screenNames';

StatusBar.setHidden(true);

var {height,width} = Dimensions.get('window');

let routeConfigs = {

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
    initialRouteName: AuthenticationScreen,
    drawerWidth: width / 2,
    drawerPosition: 'left'
}

const MyDrawerNavigator = createDrawerNavigator(routeConfigs,drawerNavigatorConfig);

const Menu = createAppContainer(MyDrawerNavigator);

export default Menu;
