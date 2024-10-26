package com.example.groupbuying.acl.service;

import com.example.groupbuying.model.acl.Role;
import com.example.groupbuying.vo.acl.RoleQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

public interface RoleService extends IService<Role> {

	//角色分页列表
	IPage<Role> selectRolePage(Page<Role> pageParam, RoleQueryVo roleQueryVo);

	/**
	 * 根据用户获取角色数据
	 * @param adminId
	 * @return
	 */
	Map<String, Object> findRoleByUserId(Long adminId);

	/**
	 * 分配角色
	 * @param adminId
	 * @param roleIds
	 */
	void saveUserRoleRelationShip(Long adminId, Long[] roleIds);
}