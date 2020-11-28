import React, { useState, useEffect } from 'react';
import { StyleSheet, View, PermissionsAndroid } from 'react-native';
import Streaming from 'react-native-streaming';

async function requestPermissions(): Promise<boolean> {
  try {
    const granted = await PermissionsAndroid.requestMultiple([
      PermissionsAndroid.PERMISSIONS.RECORD_AUDIO,
      PermissionsAndroid.PERMISSIONS.CAMERA,
    ]);
    return (
      granted['android.permission.CAMERA'] ===
        PermissionsAndroid.RESULTS.GRANTED &&
      granted['android.permission.RECORD_AUDIO'] ===
        PermissionsAndroid.RESULTS.GRANTED
    );
  } catch (err) {
    return false;
  }
}

export default function App() {
  const [permsGranted, setPermsGranted] = useState(false);
  useEffect(() => {
    requestPermissions().then((res) => {
      if (res) {
        setPermsGranted(true);
      }
    });
  }, []);
  return (
    <View style={styles.container}>
      {permsGranted ? <Streaming color="#32a852" style={styles.box} /> : null}
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
