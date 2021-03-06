/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.the_humble_fool.PokeGoApi.jparepositories;

import com.the_humble_fool.PokeGoApi.models.entitymodels.EggPoolEntityModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author The_Humble_Fool
 */

@Repository
public interface EggPoolJpaRepo extends JpaRepository<EggPoolEntityModel, Integer>
{
    public List<EggPoolEntityModel> findByEggDistance(int eggDistance);
}
