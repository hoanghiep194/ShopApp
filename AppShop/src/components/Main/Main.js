/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {styleSheet, Text, View, Image} from 'react-native';
import Button from 'react-native-button';

import {AuthenticationScreen, ChangeInfoScreen, OrderHistoryScreen} from '../../../screenNames';
import Header from '../Header';
import Home from './Shop/Home/Home';

export default class Main extends Component {
 
  static navigationOptions = {
    drawerLabel: 'Main',
    tabBarLabel: 'Main',
    drawerIcon: ({ }) => (
      <Image
        source={require('../../icon/back.png')}
        style={{width: 26, height: 26, tintColor: '#0067a7'}}
      />
    ),
  };
  render() {

    const {navigate} = this.props.navigation;

    return (

      <View style={{flex: 1, flexDirection: 'column'}}>
        <Header {...this.props} />
        <Home/>
      </View>
    );
  }
}