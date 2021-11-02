package com.example.aindroid.organizze.activity.config;

import android.provider.ContactsContract;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ConfigFirebase {

    private static FirebaseAuth auth;
    private static DatabaseReference firebase;

    //retorna instancia do FirebaseDatabase
    public static DatabaseReference getFirebaseDatabase(){
        if(firebase == null){
            firebase = FirebaseDatabase.getInstance().getReference();
        }
        return firebase;
    }

    //retorna instancia do FirebaseAuth
    public static FirebaseAuth getAuth(){
        if (auth == null){
            auth = FirebaseAuth.getInstance();
        }
        return auth;
    }

}
