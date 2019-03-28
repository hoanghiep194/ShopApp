/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {StyleSheet, Text, View, StatusBar, Dimensions} from 'react-native';
import {createAppContainer, createDrawerNavigator, DrawerNavigator} from 'react-navigation';

import Main from './Main/Main';
import Authentication from './Authentication/Authentication';
import ChangeInfo from './ChangeInfo/ChangeInfo';
import OrderHistory from './OrderHistory/OrderHistory';

import {MainScreen1, AuthenticationScreen, ChangeInfoScreen, OrderHistoryScreen} from '../../screenNames'

StatusBar.setHidden(true);
var {height,width} = Dimensions.get('window');
// const MainNavigator = createStackNavigator({
//     MainScreen: {
//         screen: Main,
//         navigationOptions: {
//             headerTitle: 'Main'
//         }
//     },
//     AuthenticationScreen: {
//         screen: Authentication
//     },
//     ChangeInfoScreen: {
//         screen: ChangeInfo
//     },
//     OrderHistoryScreen: {
//         screen: OrderHistory
//     }
// })

let routeConfigs = {
    MainScreen1: {
        screen: Main
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
