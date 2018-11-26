import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarTest {
    @Test
    public void cypher() throws Exception {
        assertEquals("BCD", Caesar.cypher("ABC", 1));
        assertEquals("BCD", Caesar.cypher("abc", 1));
        assertEquals("YZA", Caesar.cypher("XYZ", 1));
        assertEquals("Z", Caesar.cypher("A", 25));
        assertEquals("KLM", Caesar.cypher("ABC", 10));
        assertEquals("WXY", Caesar.cypher("ABC", 100));
        assertEquals("QXE BMFDAZE PQ OAZEGY P’MNMZE PQ XM ODUEU DQZQUJQZ, EQSAZE QXE QJBQDFE, U QX ZMPMX QZ EQDÀ XM BDAHM, MYN X’UZSDQPUQZF MRQSUF PQX NAAY PQX OAYQDÇ QXQOFDÒZUO",
                Caesar.cypher("Els patrons de consum d’abans de la crisi reneixen, segons els experts, i el Nadal en serà la prova, amb l’ingredient afegit del boom del comerç electrònic", 12));
        assertEquals("LZW USWKSJ UAHZWJ, SDKG CFGOF SK S KZAXL UAHZWJ, AK GFW GX LZW KAEHDWKL XGJEK GX WFUJQHLAGF. AL AK S KMTKLALMLAGF UAHZWJ OZWJW WSUZ DWLLWJ AF LZW GJAYAFSD EWKKSYW (USDDWV LZW HDSAFLWPL) AK JWHDSUWV OALZ S DWLLWJ UGJJWKHGFVAFY LG S UWJLSAF FMETWJ GX DWLLWJK MH GJ VGOF AF LZW SDHZSTWL.",
                Caesar.cypher("The Caesar cipher, also known as a shift cipher, is one of the simplest forms of encryption. It is a substitution cipher where each letter in the original message (called the plaintext) is replaced with a letter corresponding to a certain number of letters up or down in the alphabet.", 1500));

        assertEquals("Z'OAWQ VO RS GSF QCA SZG RWBSFG, EIS OPOBG RS BSQSGGWHOF-ZC, GS GOD SZ JOZCF EIS HÉ.", Caesar.cypher("L'amic ha de ser com els diners, que abans de necessitar-lo, se sap el valor que té.", 66));
    }

    @Test
    public void decypher() throws Exception {
        assertEquals("ABC", Caesar.decypher("BCD", 1));
        assertEquals("ZAB", Caesar.decypher("ABC", 1));
        assertEquals("A", Caesar.decypher("Z", 25));
        assertEquals("ELS PATRONS DE CONSUM D’ABANS DE LA CRISI RENEIXEN, SEGONS ELS EXPERTS, I EL NADAL EN SERÀ LA PROVA, AMB L’INGREDIENT AFEGIT DEL BOOM DEL COMERÇ ELECTRÒNIC",
                Caesar.decypher("QXE BMFDAZE PQ OAZEGY P’MNMZE PQ XM ODUEU DQZQUJQZ, EQSAZE QXE QJBQDFE, U QX ZMPMX QZ EQDÀ XM BDAHM, MYN X’UZSDQPUQZF MRQSUF PQX NAAY PQX OAYQDÇ QXQOFDÒZUO", 12));

        assertEquals("L'AMIC HA DE SER COM ELS DINERS, QUE ABANS DE NECESSITAR-LO, SE SAP EL VALOR QUE TÉ.",
                Caesar.decypher("Z'OAWQ VO RS GSF QCA SZG RWBSFG, EIS OPOBG RS BSQSGGWHOF-ZC, GS GOD SZ JOZCF EIS HÉ.", 66));

    }
}