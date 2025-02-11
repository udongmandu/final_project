package com.classpick.web.zoom.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ZoomMeetingRequest {
	private List<ZoomDate> zoomDates;
}