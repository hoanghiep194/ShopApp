/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, { Component } from 'react';
import { StyleSheet, Text, View, Image, Icon } from 'react-native';
import Header from '../../Main/Header';
import Home from './Home/Home';

export default class Shop extends Component {

  constructor(props) {
    super(props);
    this.state = {
      types: [],
      topProduct: []
    };
  }

  static navigationOptions = {
    tabBarLabel: 'Home',
    tabBarIcon: () => {
      return <Image
        source={require('../../../icon/home.png')}
        style={{ width: 26, height: 26, tintColor: '#007256' }}
      />
    }
  };

  componentDidMount() {
    return fetch('http://10.1.10.166:8080/api/')
      .then((response) => response.json())
      .then((responseJson) => {
        this.setState({
          types: responseJson.response.resultData.productTypes,
          topProduct: responseJson.response.resultData.products
        });
      })
      .catch((error) => {
        console.error(error);
      });
  };

  render() {

    return (
      <View style={{ flex: 1, flexDirection: 'column' }}>
        <Header {...this.props} />
        <Home productType={this.state.types} topProduct={this.state.topProduct}/>
      </View>
    );
  }
}