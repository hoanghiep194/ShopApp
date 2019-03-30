/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {StyleSheet, Text, View, Image, Icon} from 'react-native';
import Header from '../../Main/Header';
import Home from './Home/Home';

export default class Shop extends Component {

  static navigationOptions = {
    tabBarLabel: 'Home',
    tabBarIcon: () => {
        return <Image
          source={require('../../../icon/home.png')}
          style={{ width: 26, height: 26, tintColor: '#007256' }}
        />
    }
  };

  render() {

    return (
      <View style={{flex: 1, flexDirection: 'column'}}>
        <Header {...this.props} />
        <Home/>
      </View>
    );
  }
}