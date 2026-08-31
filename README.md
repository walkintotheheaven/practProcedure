# Praktikum Java - Data Mahasiswa & Tabel Perkalian

Program Java sederhana yang digunakan untuk menerima data mahasiswa dan menampilkan kartu mahasiswa, kemudian membuat tabel perkalian berdasarkan angka yang diinputkan oleh pengguna.

Program ini menggunakan konsep **method/function, `Scanner`, perulangan `for`, dan tipe data dasar Java**.

## 📌 Fitur

Program memiliki dua fungsi utama:

1. **Menampilkan data mahasiswa**

   * Input nama mahasiswa.
   * Input NIM.
   * Input IPK.
   * Menampilkan data dalam bentuk kartu mahasiswa.

2. **Menampilkan tabel perkalian**

   * Meminta pengguna memasukkan sebuah angka.
   * Menampilkan hasil perkalian angka tersebut dari `1` sampai angka yang dimasukkan.

## 🛠️ Teknologi

* **Java**
* `java.util.Scanner`
* Method / Function
* Perulangan `for`
* `String`
* `int`
* `Double`

## 📂 Struktur Method

Program memiliki tiga method utama:

| Method                 | Fungsi                                           |
| ---------------------- | ------------------------------------------------ |
| `cetakGaris()`         | Mencetak garis pembatas sebanyak 30 karakter `=` |
| `tampilkanMahasiswa()` | Meminta input dan menampilkan data mahasiswa     |
| `cetakTabel()`         | Meminta angka dan menampilkan tabel perkalian    |

Selain itu terdapat method `main()` sebagai titik awal program.

## 🔹 Method `cetakGaris()`

Method ini digunakan untuk mencetak garis pembatas.

```java
static void cetakGaris() {
    for (int i = 1; i <= 30; i++) {
        System.out.print("=");
    }
}
```

Perulangan `for` akan berjalan sebanyak **30 kali**, sehingga menghasilkan:

```text
==============================
```

Method ini kemudian digunakan di dalam `tampilkanMahasiswa()` untuk membuat tampilan kartu mahasiswa lebih rapi.

## 👨‍🎓 Method `tampilkanMahasiswa()`

Method ini digunakan untuk memasukkan dan menampilkan data mahasiswa.

Data yang dimasukkan:

* Nama
* NIM
* IPK

Contoh input:

```text
Nama
Ahmad

NIM
12345678

IPK
3.75
```

Setelah data dimasukkan, program menampilkan:

```text
==============================
KARTU MAHASISWA
==============================
Nama: Ahmad
NIM: 12345678
IPK: 3.75
==============================
```

Program juga menggunakan kode ANSI:

```java
System.out.println("\u001B[32m");
```

untuk memberikan efek warna pada output di terminal yang mendukung ANSI color.

## ✖️ Method `cetakTabel()`

Method ini digunakan untuk membuat tabel perkalian.

Program meminta pengguna memasukkan sebuah angka:

```text
Inputin angka
5
```

Kemudian perulangan:

```java
for (int i = 1; i <= angka; i++) {
    System.out.println(angka + "*" + i + " = " + (angka * i));
}
```

akan menampilkan:

```text
5*1 = 5
5*2 = 10
5*3 = 15
5*4 = 20
5*5 = 25
```

Perulangan berhenti ketika nilai `i` sudah lebih besar dari angka yang dimasukkan.

## 🔄 Alur Program

Program dijalankan melalui method `main()`:

```java
public static void main(String[] args) {
    tampilkanMahasiswa();
    cetakTabel();
}
```

Urutan program:

```text
Program dimulai
      ↓
tampilkanMahasiswa()
      ↓
Input Nama
      ↓
Input NIM
      ↓
Input IPK
      ↓
Tampilkan Kartu Mahasiswa
      ↓
cetakTabel()
      ↓
Input Angka
      ↓
Perulangan Perkalian
      ↓
Tampilkan Tabel
      ↓
Program selesai
```

## 📋 Variabel

| Variabel   | Tipe Data | Fungsi                                |
| ---------- | --------- | ------------------------------------- |
| `input`    | `Scanner` | Membaca input dari pengguna           |
| `i`        | `int`     | Counter pada perulangan               |
| `namaGweh` | `String`  | Menyimpan nama mahasiswa              |
| `nimGweh`  | `String`  | Menyimpan NIM mahasiswa               |
| `ipkGweh`  | `Double`  | Menyimpan IPK mahasiswa               |
| `angka`    | `int`     | Menyimpan angka untuk tabel perkalian |

## 📚 Konsep Java yang Digunakan

### 1. Static Variable

Scanner dibuat sebagai static variable:

```java
static Scanner input = new Scanner(System.in);
```

Dengan begitu, `input` dapat digunakan oleh beberapa method tanpa harus membuat `Scanner` baru.

### 2. Method

Program memisahkan tugas ke beberapa method:

```java
tampilkanMahasiswa();
cetakTabel();
cetakGaris();
```

Hal ini membuat kode lebih terstruktur dan mudah digunakan kembali.

### 3. Perulangan `for`

Digunakan pada `cetakGaris()` untuk mencetak 30 karakter `=` dan pada `cetakTabel()` untuk membuat tabel perkalian.

### 4. Scanner

`Scanner` digunakan untuk menerima input dari pengguna:

```java
input.nextLine();
input.nextDouble();
input.nextInt();
```

## ▶️ Cara Menjalankan

Simpan kode dengan nama:

```text
pract00.java
```

Kemudian compile menggunakan:

```bash
javac pract00.java
```

Jalankan program dengan:

```bash
java pract00
```

## 📝 Catatan

Program ini merupakan latihan dasar Java yang menggabungkan beberapa konsep, yaitu **input menggunakan Scanner, method, perulangan `for`, variabel, dan output menggunakan `System.out.println()`**.

Program menjalankan `tampilkanMahasiswa()` terlebih dahulu, kemudian menjalankan `cetakTabel()` setelah seluruh data mahasiswa selesai dimasukkan.
