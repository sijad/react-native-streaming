import * as React from 'react';
import { StyleSheet, View } from 'react-native';
import Streaming from 'react-native-streaming';

export default function App() {
  return (
    <View style={styles.container}>
      <Streaming color="#32a852" style={styles.box} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  box: {
    flex: 1,
  },
});
