# Selenium Test Automation Project

## 📖 Deskripsi
Project test automation menggunakan Selenium WebDriver dengan Maven dan TestNG untuk testing aplikasi web SauceDemo. Project ini mengimplementasikan Page Object Model (POM) pattern dan berbagai best practices dalam test automation.

## 🛠️ Tech Stack
- **Java** - Programming language
- **Selenium WebDriver 4.15.0** - Web automation framework
- **TestNG 7.8.0** - Testing framework
- **Maven** - Build management dan dependency
- **WebDriverManager 5.6.2** - Automatic driver management
- **ExtentReports 5.1.1** - Test reporting
- **Apache POI 5.2.4** - Excel file operations

## 🚀 Prerequisites
Pastikan sudah terinstall:
- Java JDK 11 atau lebih tinggi
- Maven 3.6+
- VS Code dengan Extensions:
  - Extension Pack for Java
  - Maven for Java
  - TestNG for Java

## ⚙️ Setup & Installation

### 1. Clone/Download Project
```bash
git clone <repository-url>
cd selenium-automation
```

### 2. Install Dependencies
```bash
mvn clean install
```

### 3. Verify Setup
```bash
mvn test -Dtest=LoginTest
```

## 🧪 Test Cases

### Inventory Tests (`InventoryTest.java`)
- ✅ **testAddItems** - Test add item ke shopping cart
  - Verifikasi total produk yang ditampilkan
  - Add item ke cart
  - Verifikasi cart badge count
  - Verifikasi button "Remove" muncul

## 🎯 Page Object Classes

### InventoryPage
- `getTotalProductDisplayed()` - Get jumlah produk yang ditampilkan
- `addItemToCart()` - Add item ke shopping cart
- `getCartItemCount()` - Get jumlah item di cart badge
- `isRemoveButtonExists()` - Check apakah remove button ada
- `removeItem()` - Remove item dari cart

## 🏃‍♂️ Running Tests

### Run All Tests
```bash
mvn test
```

### Run Specific Test Class
```bash
mvn test -Dtest=AuthenticationTest
mvn test -Dtest=InventoryTest
```

### Run Specific Test Method
```bash
mvn test -Dtest=AuthenticationTest#loginTest
mvn test -Dtest=InventoryTest#testAddItems
```

### Run dengan TestNG XML
```bash
mvn test -DsuiteXmlFile=testng.xml
```

### Run dengan Browser Parameter
```bash
mvn test -Dbrowser=chrome
mvn test -Dbrowser=firefox
mvn test -Dbrowser=edge
```

## 🔧 Configuration

### TestNG Configuration (`testng.xml`)
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Swaglabs eCommerce Suite">
  <test name="Automation Test">
  <parameter name="baseURL" value="https://www.saucedemo.com/v1/index.html"/>
  <parameter name="username" value="standard_user"></parameter>
  <parameter name="password" value="secret_sauce"></parameter>

    <classes>
        <class name="com.juaracoding.selenium.tests.InventoryTest"></class>
    </classes>

  </test>
</suite>
```

### Maven Configuration (`pom.xml`)
- Selenium WebDriver dependencies
- TestNG framework
- WebDriverManager untuk automatic driver setup
- ExtentReports untuk test reporting
- Apache POI untuk Excel operations

## 📈 Features

### ✨ Implemented Features
- **Page Object Model (POM)** pattern
- **Data-driven testing** dengan TestNG DataProvider
- **Cross-browser testing** (Chrome, Firefox, Edge)
- **Automatic driver management** dengan WebDriverManager
- **Element existence validation** 
- **Explicit waits** untuk better stability
- **Clean test structure** dengan BaseTest
- **Proper error handling** dan assertions

### 🔄 Best Practices
- **No hard-coded waits** (Thread.sleep)
- **Reusable components** dan utilities
- **Clear assertion messages** untuk debugging
- **Consistent naming conventions**
- **Proper exception handling**

## 🐛 Troubleshooting

### Common Issues

1. **TestNG XML not found**
   ```bash
   # Pastikan testng.xml ada di root project
   # Update pom.xml surefire plugin configuration
   ```

2. **Driver not found**
   ```bash
   # WebDriverManager otomatis download driver
   # Pastikan internet connection available
   ```

3. **Element not found**
   ```bash
   # Check XPath syntax (// bukan ///)
   # Verify element locators di browser
   ```

4. **Maven dependency issues**
   ```bash
   mvn clean install -U
   ```

## 📝 Reporting
Test reports akan generate di:
- `target/surefire-reports/` - TestNG default reports
- `test-output/` - TestNG HTML reports

## 🤝 Contributing
1. Fork project
2. Create feature branch
3. Commit changes
4. Push to branch  
5. Create Pull Request

## 📄 License
This project is licensed under the MIT License.

---
**Happy Testing!** 🚀
