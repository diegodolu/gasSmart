package com.miempresa.gasapp;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BalonDAO_Impl implements BalonDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Balon> __insertionAdapterOfBalon;

  public BalonDAO_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBalon = new EntityInsertionAdapter<Balon>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `Balon` (`id`,`empresa`,`peso`,`valvula`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Balon entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getEmpresa() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getEmpresa());
        }
        if (entity.getPeso() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPeso());
        }
        if (entity.getValvula() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getValvula());
        }
      }
    };
  }

  @Override
  public void insert(final Balon balon) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfBalon.insert(balon);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Balon> getAll() {
    final String _sql = "SELECT * FROM Balon";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfEmpresa = CursorUtil.getColumnIndexOrThrow(_cursor, "empresa");
      final int _cursorIndexOfPeso = CursorUtil.getColumnIndexOrThrow(_cursor, "peso");
      final int _cursorIndexOfValvula = CursorUtil.getColumnIndexOrThrow(_cursor, "valvula");
      final List<Balon> _result = new ArrayList<Balon>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Balon _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpEmpresa;
        if (_cursor.isNull(_cursorIndexOfEmpresa)) {
          _tmpEmpresa = null;
        } else {
          _tmpEmpresa = _cursor.getString(_cursorIndexOfEmpresa);
        }
        final String _tmpPeso;
        if (_cursor.isNull(_cursorIndexOfPeso)) {
          _tmpPeso = null;
        } else {
          _tmpPeso = _cursor.getString(_cursorIndexOfPeso);
        }
        final String _tmpValvula;
        if (_cursor.isNull(_cursorIndexOfValvula)) {
          _tmpValvula = null;
        } else {
          _tmpValvula = _cursor.getString(_cursorIndexOfValvula);
        }
        _item = new Balon(_tmpId,_tmpEmpresa,_tmpPeso,_tmpValvula);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Balon getById(final int id) {
    final String _sql = "SELECT * FROM Balon WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfEmpresa = CursorUtil.getColumnIndexOrThrow(_cursor, "empresa");
      final int _cursorIndexOfPeso = CursorUtil.getColumnIndexOrThrow(_cursor, "peso");
      final int _cursorIndexOfValvula = CursorUtil.getColumnIndexOrThrow(_cursor, "valvula");
      final Balon _result;
      if (_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpEmpresa;
        if (_cursor.isNull(_cursorIndexOfEmpresa)) {
          _tmpEmpresa = null;
        } else {
          _tmpEmpresa = _cursor.getString(_cursorIndexOfEmpresa);
        }
        final String _tmpPeso;
        if (_cursor.isNull(_cursorIndexOfPeso)) {
          _tmpPeso = null;
        } else {
          _tmpPeso = _cursor.getString(_cursorIndexOfPeso);
        }
        final String _tmpValvula;
        if (_cursor.isNull(_cursorIndexOfValvula)) {
          _tmpValvula = null;
        } else {
          _tmpValvula = _cursor.getString(_cursorIndexOfValvula);
        }
        _result = new Balon(_tmpId,_tmpEmpresa,_tmpPeso,_tmpValvula);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
