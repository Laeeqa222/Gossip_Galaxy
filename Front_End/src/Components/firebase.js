import firebase from "firebase";

firebase.initializeApp({
  apiKey: "AIzaSyC4-B6n8I7F6DzWihDp2w6CO32AlGXrUFo",
  authDomain: "gossip-galaxy.firebaseapp.com",
  projectId: "gossip-galaxy",
  storageBucket: "gossip-galaxy.appspot.com",
  messagingSenderId: "974815626056",
  appId: "1:974815626056:web:1f4c5e80b671a114b5a97d"
});
const auth=firebase.auth();
const storage=firebase.storage();
export {storage,auth};

