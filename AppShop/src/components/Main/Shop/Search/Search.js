/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {SyleSheet, Text, View, Image} from 'react-native';

export default class Search extends Component {
 
  static navigationOptions = {
    tabBarLabel: 'Search',
    tabBarIcon: () => {
        return <Image
          source={require('../../../../icon/search.png')}
          style={{ width: 26, height: 26, tintColor: '#007256' }}
        />
    }
  };
  render() {

    return (

      <View style={{flex: 1, flexDirection: 'column'}}>
        <Text>Search</Text>
      </View>
    );
  }
}