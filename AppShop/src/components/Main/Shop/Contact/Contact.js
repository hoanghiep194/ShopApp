/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {StyleSheet, Text, View, Image} from 'react-native';

export default class Contact extends Component {
 
  static navigationOptions = {
    tabBarLabel: 'Contact',
    tabBarIcon: () => {
        return <Image
          source={require('../../../../icon/contact.png')}
          style={{ width: 26, height: 26, tintColor: '#007256' }}
        />
    }
  };
  render() {

    return (
      <View style={{flex: 1, flexDirection: 'column'}}>
        <Text>Contact</Text>
      </View>
    );
  }
}