#### Demonstration of JAXB exceptions localization problem

Steps to reproduce:
1. Run `mvn` to compile and run program

On startup application [generates exception](https://github.com/jakartaee/jaxb-api/blob/748c50bb8f71b4687febca5400fa9c574644aac3/api/src/main/java/jakarta/xml/bind/util/JAXBSource.java#L96) and [writes it](https://github.com/bvfalcon/jaxb-localization-test/blob/f2f494efe528785f2b917d2441eca3b246dee22b/src/main/java/com/example/test/jaxbl10n/App.java#L19) using default system Locale

2. Input into console any other locale and press <Enter>

Change of system locale **has no effect** on localized message.
