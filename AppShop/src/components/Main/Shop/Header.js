import React, {Component} from 'react';
import {StyleSheet, Text, View, TouchableOpacity, Image, Dimensions, TextInput} from 'react-native';

var { height } = Dimensions.get('window');

export default class Header extends Component {
    render() {
        return(
            <View style={styles.container}>
                <View style={styles.header}>
                    <TouchableOpacity 
                        onPress={() => {
                            const { navigation } = this.props;
                            navigation.openDrawer();
                        }}>
                        <Image 
                            source={require('../icon/ic_menu.png')}
                            style={{ width:30, height: 30}}
                        />
                    </TouchableOpacity>
                    <Text style={{ color:'#FFF', fontFamily:'Avenir', fontSize: 20}}>Wearing a Dress</Text>
                    <Image 
                        source={require('../icon/ic_logo.png')}
                        style={{ width:30, height: 30}}
                    />
                </View>
                <TextInput
                    style={{height: height / 20, backgroundColor: '#FFF',padding: 5}}
                    placeholder='What do you want to buy?'
                />
            </View>
        );
    }
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: '#34B089',
        height: height / 7,
        padding: 10,
        paddingTop: 30,
        justifyContent: 'space-around'
    },
    header: {
        flexDirection: 'row',
        justifyContent: 'space-between',
        alignItems: 'center'
    }

})