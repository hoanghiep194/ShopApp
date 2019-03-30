/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {StyleSheet, Text, View, Image} from 'react-native';

export default class Cart extends Component {
 
  static navigationOptions = {
    tabBarLabel: 'Cart',
    tabBarIcon: () => {
        return <Image
          source={require('../../../../icon/cart.png')}
          style={{ width: 26, height: 26, tintColor: '#007256' }}
        />
    }
  };
  render() {

    return (

      <View style={{flex: 1, flexDirection: 'column'}}>
        <Text>Cart</Text>
      </View>
    );
  }
}