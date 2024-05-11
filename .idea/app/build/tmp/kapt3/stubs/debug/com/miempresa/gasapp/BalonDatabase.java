package com.miempresa.gasapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/miempresa/gasapp/BalonDatabase;", "Landroidx/room/RoomDatabase;", "()V", "balonDao", "Lcom/miempresa/gasapp/BalonDAO;", "app_debug"})
@androidx.room.Database(entities = {com.miempresa.gasapp.Balon.class}, version = 1)
public abstract class BalonDatabase extends androidx.room.RoomDatabase {
    
    public BalonDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.miempresa.gasapp.BalonDAO balonDao();
}