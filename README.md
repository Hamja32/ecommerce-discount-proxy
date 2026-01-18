
```markdown
# Proxy Design Pattern based small project and other knowledge

## Project Overview: E-Commerce Discount System
This project demonstrates the **Proxy Design Pattern** using a real-world scenario of an E-commerce platform (like Flipkart). The goal is to separate the business logic of applying discounts from the core purchasing logic.

### 📂 Project Structure
```text
src
├── com.hamza.component
│   ├── FlipcartService.java        (Interface)
│   └── FlipcartServiceImpl.java    (Concrete Class - Real Object)
├── com.hamza.proxy
│   └── FlipcartServiceProxy.java   (Proxy Class)
├── com.hamza.factory
│   └── EcommerceFactory.java       (Factory Class)
└── com.hamza.test
    └── ProxyDPTest.java            (Client/Main Class)

```

### 🧠 How It Works

The Proxy pattern allows us to provide a substitute or placeholder for another object to control access to it.

1. **Interface (`FlipcartService`)**: Defines the contract with the method `buyNow()`.
2. **Concrete Class (`FlipcartServiceImpl`)**: The actual implementation that processes the purchase at the standard price.
3. **Proxy Class (`FlipcartServiceProxy`)**: Implements the same interface. It contains the logic to check for discounts. If a discount is applicable, it calculates the new price before delegating the final processing to the Concrete class.
4. **Factory Logic (`EcommerceFactory`)**: This is where the decision is made. Based on the coupon code provided by the user:
* If a valid coupon exists, the Factory returns the **Proxy Object**.
* If no coupon exists, the Factory returns the **Real Object**.



---

## 📝 Additional Learning Notes

While building this project, I also documented key concepts regarding Hibernate and Java Reflection.

### 1. Hibernate: `.save()` vs `.persist()`

Understanding the difference between these two methods for saving data to the database:

| Feature | .save() | .persist() |
| --- | --- | --- |
| **Origin** | Hibernate Native | JPA (Java Persistence API) |
| **Return Type** | Returns `Serializable` (Primary Key/ID) | Returns `void` |
| **Status** | Deprecated | Recommended / Standard |

**Transaction Insight:**
Neither of these methods executes the SQL `INSERT` query immediately. They temporarily store the data in the persistence context. The actual query is executed only when the transaction is committed using `transaction.commit()`.

### 2. What is a Dialect?

A **Hibernate Dialect** is a component responsible for generating SQL queries (static or dynamic) specific to the underlying database (e.g., MySQL, Oracle, PostgreSQL). It acts as a translator between Hibernate and the Database.

### 3. Instantiating `java.lang.Class`

The `java.lang.Class` class has no public constructor, so you cannot use the `new` keyword. There are three specific ways to create an object of this class:

1. **Using `Class.forName()**`:
```java
Class c1 = Class.forName("java.util.Date");

```


2. **Using `getClass()` method**:
```java
String s = new String("hello");
Class c2 = s.getClass();

```


3. **Using `.class` property**:
```java
Class c3 = System.class;

```



```

---

**Would you like me to help you verify the code logic for the `EcommerceFactory` class to ensure it correctly switches between the proxy and real implementation?**

```
