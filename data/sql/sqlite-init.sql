# SQLITE init SQL
#
PRAGMA foreign_keys = OFF;

-- ----------------------------
-- Create user table
-- Table structure for tf_user
-- ----------------------------
DROP TABLE IF EXISTS "main"."tf_user";
CREATE TABLE tf_user (id string, nickname string, avatar string, mobile string, sex integer, type integer, gmt_create String, gmt_modified String);
