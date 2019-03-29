/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {tyleSheet, Text, View, Image} from 'react-native';

export default class Authentication extends Component {
  static navigationOptions = {
    drawerLabel: 'Authentication',
    tabBarLabel: 'Authentication',
    drawerIcon: ({ }) => (
      <Image
        source={require('../../icon/back.png')}
        style={{width: 26, height: 26, tintColor: '#0067a7'}}
      />
    ),
  };
  render() {
    return (
      <View>
        <Text>Welcome to React Authentication!</Text>
      </View>
    );
  }
}