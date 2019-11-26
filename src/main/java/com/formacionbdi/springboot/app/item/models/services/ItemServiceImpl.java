package com.formacionbdi.springboot.app.item.models.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.item.models.Item;

@Service
public class ItemServiceImpl implements IItemService {

	@Override
	public List<Item> findAll() {
		return null;
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		return null;
	}

}
