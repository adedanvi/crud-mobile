package com.khalifa.inicrud;

/**
 * Created by khalifa on 24/03/17.
 */

public class biodata extends Koneksi {

    String URL = "http://khalifa.esy.es/mahasiswa.php";
    String url = "";
    String response = "";

    public String tampilBiodata() {
        try {
            url = URL + "?pancal=view";
            System.out.println("URL Tampil Biodata: " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }



    public String inserBiodata(String nama, String alamat) {
        nama=nama.replace(" ","%20");
        alamat=alamat.replace(" ","%20");

        try {
            url = URL + "?pancal=insert&nama=" + nama + "&alamat=" + alamat;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String getBiodataById(int id) {
        try {
            url = URL + "?pancal=get_biodata_by_id&id=" + id;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String updateBiodata(String id, String nama, String alamat) {
        nama=nama.replace(" ","%20");
        alamat=alamat.replace(" ","%20");
        try {
            url = URL + "?pancal=update&id=" + id + "&nama=" + nama + "&alamat=" + alamat;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String deleteBiodata(int id) {
        try {
            url = URL + "?pancal=delete&id=" + id;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }
}

