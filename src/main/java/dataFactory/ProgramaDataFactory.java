package dataFactory;

import model.ProgramaModel;
import net.datafaker.Faker;
import service.ProgramaService;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class ProgramaDataFactory{
    private static Faker faker = new Faker();
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static ProgramaService programaService = new ProgramaService();
//region GERAR PROGRAMA
    public static ProgramaModel gerarProgramaValido() {
        ProgramaModel programa = new ProgramaModel();
        programa.setNome("VemSer 15");
        programa.setDescricao("Descrição do " + programa.getNome());
        programa.setDataInicio(dateFormat.format(faker.date().future(2, 1, TimeUnit.DAYS)));
        programa.setDataFim(dateFormat.format(faker.date().future(40, 39, TimeUnit.DAYS)));
        programa.setStatus("FECHADO");
        return programa;
    }

    public static ProgramaModel gerarProgramaComNomeNulo() {
        ProgramaModel programa = new ProgramaModel();
        programa.setNome("");
        programa.setDescricao("Descrição do " + programa.getNome());
        programa.setDataInicio(dateFormat.format(faker.date().future(2, 1, TimeUnit.DAYS)));
        programa.setDataFim(dateFormat.format(faker.date().future(40, 39, TimeUnit.DAYS)));
        programa.setStatus("FECHADO");
        return programa;
    }
//endregion
//region ID PARA CENARIOS DE ERRO
    public static ProgramaModel programaComValorDeIdNegativo(Integer idPrograma){
        ProgramaModel programa = new ProgramaModel();
        programa.setIdPrograma(idPrograma);
        return programa;
    }
    public static ProgramaModel programaComIdDeValorZero(){
        ProgramaModel programa = new ProgramaModel();
        programa.setIdPrograma(00000000000000);
        return programa;
    }
//endregion
//region ATUALIZAR PROGRAMA
     private static ProgramaModel atualizarPrograma(){
         ProgramaModel programa = new ProgramaModel();
         programa.setNome("VemSer 15");
         programa.setDescricao("Descrição do " + programa.getNome());
         programa.setDataInicio(dateFormat.format(faker.date().future(2, 1, TimeUnit.DAYS)));
         programa.setDataFim(dateFormat.format(faker.date().future(40, 39, TimeUnit.DAYS)));
         programa.setStatus("FECHADO");
         return programa;
     }
    public static ProgramaModel atualizarProgramaComValorDeIdVazio(){
        ProgramaModel programa = new ProgramaModel();
        programa.setIdPrograma(-45678);
        return programa;
    }
//endregion
}
