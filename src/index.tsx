import { requireNativeComponent, ViewStyle } from 'react-native';

type StreamingProps = {
  color: string;
  style: ViewStyle;
};

const StreamingViewManager = requireNativeComponent<StreamingProps>(
  'StreamingView'
);

export default StreamingViewManager;
