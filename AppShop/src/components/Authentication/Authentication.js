/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {StyleSheet, Text, View, Image, TouchableOpacity, TextInput} from 'react-native';
import SignIn from '../Authentication/SignIn';
import SignUp from '../Authentication/SignUp';

export default class Authentication extends Component {
  static navigationOptions = {
    drawerLabel: 'Authentication'
  };

  constructor(props) {
    super(props);
    this.state = {
      isLogin : false
    }
  }

  render() {

    const login = this.state.isLogin ? <SignIn /> : <SignUp /> ;

    return (
      <View style={{flex:1}}>
        {login}
      </View>
    );
  }
}