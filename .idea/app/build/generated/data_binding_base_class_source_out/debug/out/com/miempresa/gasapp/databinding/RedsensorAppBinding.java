// Generated by view binder compiler. Do not edit!
package com.miempresa.gasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.miempresa.gasapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RedsensorAppBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnRedsensorCalibrar;

  @NonNull
  public final ImageView imgRedsensorFlecha;

  @NonNull
  public final ImageView imgRedsensorLogo;

  @NonNull
  public final ImageView imgRedsensorSs;

  @NonNull
  public final ImageView imgRedsensorWifi;

  @NonNull
  public final TextView lblRedsensorCodigo;

  @NonNull
  public final TextView lblRedsensorRed;

  @NonNull
  public final TextView lblRedsensorSubtitulo;

  @NonNull
  public final TextView lblRedsensorTitulo;

  private RedsensorAppBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnRedsensorCalibrar, @NonNull ImageView imgRedsensorFlecha,
      @NonNull ImageView imgRedsensorLogo, @NonNull ImageView imgRedsensorSs,
      @NonNull ImageView imgRedsensorWifi, @NonNull TextView lblRedsensorCodigo,
      @NonNull TextView lblRedsensorRed, @NonNull TextView lblRedsensorSubtitulo,
      @NonNull TextView lblRedsensorTitulo) {
    this.rootView = rootView;
    this.btnRedsensorCalibrar = btnRedsensorCalibrar;
    this.imgRedsensorFlecha = imgRedsensorFlecha;
    this.imgRedsensorLogo = imgRedsensorLogo;
    this.imgRedsensorSs = imgRedsensorSs;
    this.imgRedsensorWifi = imgRedsensorWifi;
    this.lblRedsensorCodigo = lblRedsensorCodigo;
    this.lblRedsensorRed = lblRedsensorRed;
    this.lblRedsensorSubtitulo = lblRedsensorSubtitulo;
    this.lblRedsensorTitulo = lblRedsensorTitulo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RedsensorAppBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RedsensorAppBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.redsensor_app, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RedsensorAppBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_redsensor_calibrar;
      Button btnRedsensorCalibrar = ViewBindings.findChildViewById(rootView, id);
      if (btnRedsensorCalibrar == null) {
        break missingId;
      }

      id = R.id.img_redsensor_flecha;
      ImageView imgRedsensorFlecha = ViewBindings.findChildViewById(rootView, id);
      if (imgRedsensorFlecha == null) {
        break missingId;
      }

      id = R.id.img_redsensor_logo;
      ImageView imgRedsensorLogo = ViewBindings.findChildViewById(rootView, id);
      if (imgRedsensorLogo == null) {
        break missingId;
      }

      id = R.id.img_redsensor_ss;
      ImageView imgRedsensorSs = ViewBindings.findChildViewById(rootView, id);
      if (imgRedsensorSs == null) {
        break missingId;
      }

      id = R.id.img_redsensor_wifi;
      ImageView imgRedsensorWifi = ViewBindings.findChildViewById(rootView, id);
      if (imgRedsensorWifi == null) {
        break missingId;
      }

      id = R.id.lbl_redsensor_codigo;
      TextView lblRedsensorCodigo = ViewBindings.findChildViewById(rootView, id);
      if (lblRedsensorCodigo == null) {
        break missingId;
      }

      id = R.id.lbl_redsensor_red;
      TextView lblRedsensorRed = ViewBindings.findChildViewById(rootView, id);
      if (lblRedsensorRed == null) {
        break missingId;
      }

      id = R.id.lbl_redsensor_subtitulo;
      TextView lblRedsensorSubtitulo = ViewBindings.findChildViewById(rootView, id);
      if (lblRedsensorSubtitulo == null) {
        break missingId;
      }

      id = R.id.lbl_redsensor_titulo;
      TextView lblRedsensorTitulo = ViewBindings.findChildViewById(rootView, id);
      if (lblRedsensorTitulo == null) {
        break missingId;
      }

      return new RedsensorAppBinding((ConstraintLayout) rootView, btnRedsensorCalibrar,
          imgRedsensorFlecha, imgRedsensorLogo, imgRedsensorSs, imgRedsensorWifi,
          lblRedsensorCodigo, lblRedsensorRed, lblRedsensorSubtitulo, lblRedsensorTitulo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
