package com.my.ab;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.SpannableString;
import android.text.util.Linkify;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AboutBox
{static String VersionName(Context context) {
		try {
			return context.getPackageManager().getPackageInfo(context.getPackageName(),0).versionName;
		} catch (NameNotFoundException e) {
			return "Unknown";
		}
	}
	public static void Show(Activity callingActivity) {
		
		SpannableString aboutText = new SpannableString("Version " + VersionName(callingActivity)+ "\n\n"
														+ callingActivity.getString(R.string.about));
		
		View about;
		TextView tvAbout;
		try {
			
			LayoutInflater inflater = callingActivity.getLayoutInflater();
			about = inflater.inflate(R.layout.about, (ViewGroup) callingActivity.findViewById(R.id.aboutView));
			tvAbout = (TextView) about.findViewById(R.id.aboutText);
		} catch(InflateException e) {
			
			about = tvAbout = new TextView(callingActivity);
		}
		
		tvAbout.setText(aboutText);
		
		Linkify.addLinks(tvAbout, Linkify.ALL);
		
		new AlertDialog.Builder(callingActivity)
			.setTitle("Go to " + callingActivity.getString(R.string.app_namer))
			.setCancelable(true)
			.setIcon(R.drawable.ic_launcher_background)
			.setPositiveButton("OK", null)
			.setView(about)
			.show();  

		
	}
	public static void Sho(Activity callingActivity) {

		SpannableString aboutText = new SpannableString("Version " + VersionName(callingActivity)+ "\n\n"
														+ callingActivity.getString(R.string.sett));

		View sett;
		TextView tvAbout;
		try {

			LayoutInflater inflater = callingActivity.getLayoutInflater();
			sett = inflater.inflate(R.layout.about, (ViewGroup) callingActivity.findViewById(R.id.aboutView));
			tvAbout = (TextView) sett.findViewById(R.id.aboutText);
		} catch(InflateException e) {

			sett = tvAbout = new TextView(callingActivity);
		}

		tvAbout.setText(aboutText);

		Linkify.addLinks(tvAbout, Linkify.ALL);

		new AlertDialog.Builder(callingActivity)
			.setTitle("Go to " + callingActivity.getString(R.string.app_namer))
			.setCancelable(true)
			.setIcon(R.drawable.ic_launcher_background)
			.setPositiveButton("OK", null)
			.setView(sett)
			.show();  
		
}

	public static void She(Activity callingActivity) {

		SpannableString aboutText = new SpannableString("Version " + VersionName(callingActivity)+ "\n\n"
														+ callingActivity.getString(R.string.abcd));

		View abcd;
		TextView tvAbout;
		try {

			LayoutInflater inflater = callingActivity.getLayoutInflater();
			abcd = inflater.inflate(R.layout.about, (ViewGroup) callingActivity.findViewById(R.id.aboutView));
			tvAbout = (TextView) abcd.findViewById(R.id.aboutText);
		} catch(InflateException e) {

			abcd = tvAbout = new TextView(callingActivity);
		}

		tvAbout.setText(aboutText);

		Linkify.addLinks(tvAbout, Linkify.ALL);

		new AlertDialog.Builder(callingActivity)
			.setTitle("Go to " + callingActivity.getString(R.string.app_namer))
			.setCancelable(true)
			.setIcon(R.drawable.ic_launcher_background)
			.setPositiveButton("OK", null)
			.setView(abcd)
			.show();  }}
