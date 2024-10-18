package be.vaph.demo;

public interface MyAwesomeInterface {

    /// # Nieuwe Documentatie Opties
    void title();

    /// ## JEP 467: Markdown Documentation Comments
    ///
    /// [OpenJDK article](https://openjdk.org/jeps/467)
    ///
    /// Het is nu mogelijk om JavaDoc te schrijven door midden van markdown.
    /// Dit maakt het voor ons als developer eenvoudiger om complexere documentie
    /// te schrijven die onder andere lijsten, tables, code, en meer bevat.
    /// _(Markdown maakt het ook nog steeds mogelijk om html te gebruiken in de docs)_
    ///
    /// Voor meer info over markdown synctax, zie de [markdown spec](https://spec.commonmark.org/0.30/)
    ///
    /// Hier volgen enkele voorbeelden waaronder enkele speciale aanpassingen
    /// voor de JavaDoc markdown implementatie.
    void jep467();


    /// ### Links
    ///
    /// Links gebruiken een extended syntax van de standaard
    /// markdown specificatie om links naar interne code
    /// eenvoudig te maken.
    ///
    /// #### Interne code links
    ///
    /// Link naar een...
    /// - ...een module: [jdk.net] _(Zou een trailing-/ moeten hebben volgens docs, maar werkt precies nog niet in experimentele versie)_
    /// - ...een package: [be.vaph.demo]
    /// - ...een class: [MyBoringInterface]
    /// - ...een field: [String#CASE_INSENSITIVE_ORDER]
    /// - ...een method: [MyAwesomeInterface#links()]
    ///
    /// #### Plain interne code links
    ///
    /// Plain links kunnen gebruikt worden wanneer je een custom tekst
    /// wilt afbeelden voor je link, ipv de link zelf.
    ///
    /// Plain link naar een...
    /// - ...een module: [module link][jdk.net] _(Zou een trailing-/ moeten hebben volgens docs, maar werkt precies nog niet in experimentele versie)_
    /// - ...een package: [package link][be.vaph.demo]
    /// - ...een class: [class link][MyBoringInterface]
    /// - ...een field: [field link][String#CASE_INSENSITIVE_ORDER]
    /// - ...een method: [method link][MyAwesomeInterface#links()]
    ///
    /// #### Links naar externe bronnen
    ///
    /// [click me :)](https://www.instagram.com/producthumour/p/Ca8o5hDvRVa/)
    void links();

    /// ### Tabellen
    ///
    /// Tabellen maken gebruik van de
    /// [Github Flavored Markdown Syntax](https://github.github.com/gfm/)
    ///
    /// | Javadoc format   | Developer review |
    /// | ---------------- | ---------------- |
    /// | Oude JavaDoc     | 💩               |
    /// | Markdown JavaDoc | 😍               |
    void tables();

    /// ### JavaDoc Tags
    ///
    /// JavaDoc tags kunnen gebruikt worden in de nieuwe markdown documentatie
    /// net zoals we ze nu gewoon zijn _(gelieve wel iets betere beschrijvingen
    /// te voorzien :p)_
    ///
    /// @param value De value die we meegeven aan deze methode
    /// @return Something
    /// @throws IllegalArgumentException wanneer de value illegaal was
    boolean javaDocTags(String value) throws IllegalArgumentException;

    /// ### Code
    ///
    /// Om code te tonen in de documentatie kan je nu gebruik gemaakt worden
    /// van backticks voor inline of 3 backticks voor code blokken.
    ///
    /// Dit is een voorbeeld van een for-loop: `for (int i = 0; i < 100; i++)`
    ///
    /// En hier hebben we een [OutOfMemoryError] :D
    /// ```
    /// for (int i = 0; i < 100; i++) {
    ///     i = 0;
    /// }
    /// ```
    ///
    /// Met markdown is het zelfs mogelijk om syntax highlighting te voorzien voor andere
    /// talen door de taal toe te voegen achter de 3 backticks. Zie bijvoorbeeld onderstaande
    /// css die gebruikt kan worden als je klant niet betaald heeft :]
    ///
    /// ```css
    /// body {
    ///     transition: .2s
    /// }
    /// body:hover {
    ///     opacity: 0;
    /// }
    /// ```
    void code();

    /// ## JEP 413: Code Snippets in Java API Documentation
    ///
    /// [OpenJDK article](https://openjdk.org/jeps/413)
    ///
    /// Snippets zijn een nieuwe manier om code toe te voegen aan
    /// JavaDoc.
    void jep413();


    /// ### Inline Snippets
    ///
    /// Inline snippets werken gelijkaardig aan een @code blocks (of
    /// 3 backticks in markdown).
    ///
    /// {@snippet :
    /// boolean inline = true;
    ///
    ///  public boolean isInline() {
    ///      return inline;
    ///  }
    /// }
    void inlineSnippet();

    /// ### External Snippets
    ///
    /// Snippets kunnen ook vanuit een externe file gebruikt worden.
    /// Hiervoor wordt een folder "snippet-files" gemaakt in de
    /// package waar je de snippets wilt gebruiken. Deze folder bevat
    /// vervolgens de Snippet files, dit kunnen ook andere files zijn
    /// dan Java files (bv. properties files).
    ///
    /// Het voordeel hiervan is de mogelijkheid om deze files ook te
    /// gaan valideren op correcte en compileerbare code.
    ///
    /// Onderstaand voorbeeld toont een volledige file "Snippets.java"
    /// {@snippet file="Snippets.java"}
    ///
    /// Het is ook mogelijk om slechts een "region" van de file te tonen
    /// door de start van de region te markeren met een comment
    /// `// @start region="region-name"` en het einde van de region
    /// met een comment `// @end`.
    ///
    /// Onderstaande voorbeelden toont 2 verschillende regions uit de
    /// "Snippets.java" file.
    ///
    /// Region "example":
    /// {@snippet file="Snippets.java" region="example"}
    ///
    /// Region "other-example":
    /// {@snippet file="Snippets.java" region="other-example"}
    void externalSnippet();
}
