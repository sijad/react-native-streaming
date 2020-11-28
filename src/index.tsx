import { NativeModules, requireNativeComponent, ViewStyle } from 'react-native';

type StreamingType = {
  multiply(a: number, b: number): Promise<number>;
};

type StreamingProps = {
  color: string;
  style: ViewStyle;
};

const { Streaming } = NativeModules;

export const StreamingViewManager = requireNativeComponent<StreamingProps>(
  'StreamingView'
);

export default Streaming as StreamingType;
