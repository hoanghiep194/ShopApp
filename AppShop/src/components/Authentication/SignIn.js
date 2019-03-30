/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {StyleSheet, Text, View, Image, TouchableOpacity, TextInput} from 'react-native';

export default class SignIn extends Component {

    constructor(props) {
        super(props);
    }
  static navigationOptions = {
    drawerLabel: 'Authentication'
  };
  render() {

    const { signIn, signUp, inactiveStyte, activeStyte, textInputStyle, btnSignInStyle, btnTextStyle} = styles;
    return (

      <View style={{flex:1, backgroundColor: '#3EBA77', padding: 30, justifyContent: 'space-between'}}>
        <View style={{flexDirection: 'row', justifyContent: 'space-between', alignItems: 'center'}}>
            <TouchableOpacity>
                <Image 
                  source={require('../../icon/back_white.png')}
                  style={{width: 30, height: 30}}
                />
            </TouchableOpacity>
            <Text style={{color:'#FFF', fontFamily:'Avenir', fontSize: 20}}>Wearing a Dress</Text>
            <Image 
              source={require('../../icon/ic_logo.png')}
              style={{width: 30, height: 30}}
            />
        </View>
        <View style={{}}>
          <TextInput 
                style= {textInputStyle}
                placeholder= 'Enter your email'
          />
          <TextInput 
                style= {textInputStyle}
                placeholder= 'Enter your password'
          />
          <TouchableOpacity style={btnSignInStyle}>
            <Text style={btnTextStyle}>SIGN IN NOW</Text>
          </TouchableOpacity>
        </View>
        <View style={{ flexDirection: 'row'}}>
          <TouchableOpacity style={signIn}>
            <Text style={activeStyte}>SIGN IN</Text>
          </TouchableOpacity>
          <TouchableOpacity style={signUp}>
            <Text style={inactiveStyte}>SIGN UP</Text>
          </TouchableOpacity>
        </View>
      </View>
    );
  }
}

var styles = StyleSheet.create({
  signUp: {
    backgroundColor: '#fff', flex: 1, 
    alignItems: 'center', 
    padding: 10, 
    borderBottomRightRadius: 20, 
    borderTopRightRadius: 20, 
    marginLeft: 1
  },
  signIn: {
    backgroundColor: '#fff', 
    flex: 1, 
    alignItems: 'center', 
    padding: 10, 
    borderBottomLeftRadius: 20, 
    borderTopLeftRadius: 20, 
    marginRight: 1
  },
  inactiveStyte: {
    color: '#D7D7D7'
  },
  activeStyte: {
    color: '#3EBA77'
  },
  textInputStyle: {
    height: 40,
    backgroundColor: '#fff',
    marginBottom: 10,
    borderRadius: 20,
    padding: 20
  },
  btnSignInStyle: {
    borderRadius: 20,
    alignItems: 'center',
    borderColor: '#fff',
    borderWidth: 1,
    padding: 10,
    justifyContent: 'center'
  },
  btnTextStyle: {
    color: '#fff'
  }
});