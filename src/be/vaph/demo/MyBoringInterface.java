package be.vaph.demo;

public interface MyBoringInterface {

    /**
     * <h1>Nieuwe Documentatie Opties</h1>
     */
    void title();

    /**
     * <h2>JEP 467: Markdown Documentation Comments</h1>
     *
     * <a href="https://openjdk.org/jeps/467">OpenJDK article</a>
     *
     * <p>Het is nu mogelijk om JavaDoc te schrijven door midden van markdown.
     * Dit maakt het voor ons als developer eenvoudiger om complexere documentie
     * te schrijven die onder andere lijsten, tables, code, en meer bevat.
     * <i>(Markdown maakt het ook nog steeds mogelijk om html te gebruiken in de docs)</i>
     * </p>
     *
     * <p>Voor meer info over markdown synctax, zie de
     * <a href="https://spec.commonmark.org/0.30/">markdown spec</a>.</p>
     *
     * <p></p>Hier volgen enkele voorbeelden waaronder enkele speciale aanpassingen
     * voor de JavaDoc markdown implementatie.</p>
     */
    void jep467();

    /**
     * <h3>Links</h3>
     *
     * Links gebruiken een extended syntax van de standaard
     * markdown specificatie om links naar interne code
     * eenvoudig te maken.
     *
     * <h4>Interne code links</h4>
     *
     * Link naar een...
     * <ul>
     *     <li>...module: {@link jdk.net}</li>
     *     <li>...package: {@link be.vaph.demo}</li>
     *     <li>...class: {@link MyAwesomeInterface}</li>
     *     <li>...field: {@link String#CASE_INSENSITIVE_ORDER}</li>
     *     <li>...method: {@link MyAwesomeInterface#links()}</li>
     * </ul>
     *
     * <h4>Plain interne code links</h4>
     *
     * Plain links kunnen gebruikt worden wanneer je een custom tekst
     * wilt afbeelden voor je link, ipv de link zelf.
     *
     * Plain link naar een...
     * <ul>
     *     <li>...module: {@linkplain jdk.net module link}</li>
     *     <li>...package: {@linkplain be.vaph.demo package link}</li>
     *     <li>...class: {@linkplain MyAwesomeInterface class link}</li>
     *     <li>...field: {@linkplain String#CASE_INSENSITIVE_ORDER field link}</li>
     *     <li>...method: {@linkplain MyAwesomeInterface#links() method link}</li>
     * </ul>
     *
     * <h4>Links naar externe bronnen</h4>
     *
     * <a href="https://www.instagram.com/producthumour/p/Ca8o5hDvRVa/">click me :)</a>
     */
    void links();

    /**
     * <h3>Tabellen</h3>
     *
     * Tabellen maken gebruik van de
     * <a href="https://github.github.com/gfm/">Github Flavored Markdown Syntax</a>
     *
     * <table>
     *     <thead>
     *         <th>Javadoc format</th>
     *         <th>Developer review</th>
     *     </thead>
     *     <tbody>
     *         <tr>
     *              <td>Oude JavaDoc</td>
     *              <td>💩</td>
     *         </tr>
     *         <tr>
     *              <td>Markdown JavaDoc</td>
     *              <td>😍</td>
     *         </tr>
     *     </tbody>
     * </table>
     */
    void tables();

    /**
     * <h3>JavaDoc Tags</h3>
     *
     * JavaDoc tags kunnen gebruikt worden in de nieuwe markdown documentatie
     * net zoals we ze nu gewoon zijn <i>(gelieve wel iets betere beschrijvingen
     * te voorzien :p)</i>
     *
     * @param value De value die we meegeven aan deze methode
     * @return Something
     * @throws IllegalArgumentException wanneer de value illegaal was
     */
    boolean javaDocTags(String value) throws IllegalArgumentException;

    /**
     * <h3>Code</h3>
     *
     * Om code te tonen in de documentatie kan je nu gebruik gemaakt worden
     * van backticks voor inline of 3 backticks voor code blokken.
     *
     * <p>Dit is een voorbeeld van een for-loop: {@code for (int i = 0; i < 100; i++)}</p>
     *
     * En hier hebben we een {@link OutOfMemoryError} :D
     * <pre>{@code
     *  for (int i = 0; i < 100; i++) {
     *      i = 0;
     *  }
     * }</pre>
     *
     * Met markdown is het zelfs mogelijk om syntax highlighting te voorzien voor andere
     * talen door de taal toe te voegen achter de 3 backticks. Zie bijvoorbeeld onderstaande
     * css die gebruikt kan worden als je klant niet betaald heeft :]
     *
     * <pre>{@code
     *  body {
     *      transition: .2s
     *  }
     *  body:hover {
     *      opacity: 0;
     *  }
     * }</pre>
     *
     */
    void code();

    /**
     * <h2>JEP 413: Code Snippets in Java API Documentation</h2>
     *
     * <a href="https://openjdk.org/jeps/413">OpenJDK article</a>
     *
     * Snippets zijn een nieuwe manier om code toe te voegen aan
     * JavaDoc.
     */
    void jep413();

    /**
     * <h3>Inline Snippets</h3>
     *
     * Inline snippets werken gelijkaardig aan een @code blocks (of
     * 3 backticks in markdown).
     *
     * {@snippet :
     *  boolean inline = true;
     *
     *  public boolean isInline() {
     *     return inline;
     *  }
     * }
     */
    void inlineSnippet();

    /**
     * <h3>External Snippets</h3>
     *
     * <p>Snippets kunnen ook vanuit een externe file gebruikt worden.
     * Hiervoor wordt een folder "snippet-files" gemaakt in de
     * package waar je de snippets wilt gebruiken. Deze folder bevat
     * vervolgens de Snippet files, dit kunnen ook andere files zijn
     * dan Java files (bv. properties files).</p>
     *
     * <p>Het voordeel hiervan is de mogelijkheid om deze files ook te
     * gaan valideren op correcte en compileerbare code.</p>
     *
     * <p>Onderstaand voorbeeld toont een volledige file "Snippets.java"</p>
     * {@snippet file="Snippets.java"}
     *
     * <p>Het is ook mogelijk om slechts een "region" van de file te tonen
     * door de start van de region te markeren met een comment
     * <code>// @start region="region-name"</code> en het einde van de region
     * met een comment <code>// @end</code>.</p>
     *
     * <p>Onderstaande voorbeelden toont 2 verschillende regions uit de
     * "Snippets.java" file.</p>
     *
     * <p>Region "example":</p>
     * {@snippet file="Snippets.java" region="example"}
     *
     * <p>Region "other-example":</p>
     * {@snippet file="Snippets.java" region="other-example"}
     */
    void externalSnippet();
}
