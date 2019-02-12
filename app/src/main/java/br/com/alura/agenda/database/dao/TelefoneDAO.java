package br.com.alura.agenda.database.dao;

import androidx.room.Dao;
import br.com.alura.agenda.model.Telefone;

@Dao
public interface TelefoneDAO {
    Telefone buscaPrimeiroTelefoneDoAluno();
}
