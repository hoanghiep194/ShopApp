/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {tyleSheet, Text, View, Image} from 'react-native';
import Button from 'react-native-button';

import {AuthenticationScreen, ChangeInfoScreen, OrderHistoryScreen} from '../../../screenNames';
import Header from '../Header';

export default class Main extends Component {
 
  static navigationOptions = {
    drawerLabel: 'Notifications',
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
        <View style={{flex: 1, backgroundColor: 'red'}}>
            <Text>Wearing a Dress</Text>
        </View>
      </View>
    );
  }
}