/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {StyleSheet, Text, View, Image} from 'react-native';
import {createAppContainer, createBottomTabNavigator} from 'react-navigation';

import Shop from './Shop/Shop';

export default class Main extends Component {

  render() {

    const {navigate} = this.props.navigation;

    return (
      <Shop {...this.props}/>
    );
  }
}