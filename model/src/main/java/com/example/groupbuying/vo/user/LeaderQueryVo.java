package com.example.groupbuying.vo.user;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

@Data
public class LeaderQueryVo {

	@ApiModelProperty(value = "审核状态")
	private Integer checkStatus;

	@ApiModelProperty(value = "关键字")
	private String keyword;

	@ApiModelProperty(value = "省")
	private String province;

	@ApiModelProperty(value = "城市")
	private String city;

	@ApiModelProperty(value = "区域")
	private String district;

}

