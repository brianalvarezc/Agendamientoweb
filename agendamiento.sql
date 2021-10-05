-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-10-2021 a las 07:15:27
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `agendamiento`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autorizacion`
--

CREATE TABLE `autorizacion` (
  `autorizacion_Id` int(15) NOT NULL,
  `autorizacion_Id_Entidad` int(15) NOT NULL,
  `autorizacion_Id_Paciente` int(15) NOT NULL,
  `autorizacion_fecha` date NOT NULL,
  `autorizacion_Estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cita`
--

CREATE TABLE `cita` (
  `cita_Id` int(10) NOT NULL,
  `cita_Fecha` date NOT NULL,
  `cita_Hora` time(6) NOT NULL,
  `cita_Autorizacion_Id` int(10) NOT NULL,
  `cita_Entidad_Id` int(10) NOT NULL,
  `cita_Paciente_Id` int(10) NOT NULL,
  `cita_Medico_Id` int(10) NOT NULL,
  `cita_Estado` int(1) NOT NULL,
  `cita_Ubicacion` varchar(300) NOT NULL,
  `cita_Consultorio_Id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consultorio`
--

CREATE TABLE `consultorio` (
  `consultorio_Id` int(15) NOT NULL,
  `consultorio_Nombre` varchar(100) NOT NULL,
  `consultorio_Ubicacion` varchar(300) NOT NULL COMMENT 'la longitud de su dato es debido a lo extenso del link de Google Maps',
  `consultorio_Estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entidad`
--

CREATE TABLE `entidad` (
  `entidad_Id` int(15) NOT NULL,
  `entidad_Nombre` varchar(100) NOT NULL,
  `entidad_Estado` int(1) NOT NULL,
  `entidad_Direccion` varchar(100) NOT NULL,
  `entidad_Telefono` int(10) NOT NULL,
  `entidad_Tarifa` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medico`
--

CREATE TABLE `medico` (
  `medico_Id` int(15) NOT NULL,
  `medico_Nombre` varchar(100) NOT NULL,
  `medico_RegistroMedico` varchar(15) NOT NULL,
  `medico_Email` int(100) NOT NULL,
  `medico_Telefono` int(10) NOT NULL,
  `medico_Foto` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `paciente_Id` int(15) NOT NULL,
  `paciente_Nombre` varchar(100) NOT NULL,
  `paciente_Direccion` varchar(100) NOT NULL,
  `paciente_Telefono` int(10) NOT NULL,
  `paciente_Email` varchar(100) NOT NULL,
  `paciente_Foto` varchar(100) DEFAULT NULL,
  `paciente_Estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `usuario_Id` int(15) NOT NULL,
  `usuario_Nombre` int(100) NOT NULL,
  `usuario_Tipo` int(1) NOT NULL,
  `usuario_passw` varchar(15) NOT NULL,
  `usuario_Estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `autorizacion`
--
ALTER TABLE `autorizacion`
  ADD PRIMARY KEY (`autorizacion_Id`);

--
-- Indices de la tabla `cita`
--
ALTER TABLE `cita`
  ADD PRIMARY KEY (`cita_Id`),
  ADD KEY `prueba4` (`cita_Paciente_Id`),
  ADD KEY `cita_Medico_Id` (`cita_Medico_Id`),
  ADD KEY `cita_Autorizacion_Id` (`cita_Autorizacion_Id`),
  ADD KEY `cita_Entidad_Id` (`cita_Entidad_Id`),
  ADD KEY `cita_Consultorio_Id` (`cita_Consultorio_Id`);

--
-- Indices de la tabla `consultorio`
--
ALTER TABLE `consultorio`
  ADD PRIMARY KEY (`consultorio_Id`);

--
-- Indices de la tabla `entidad`
--
ALTER TABLE `entidad`
  ADD PRIMARY KEY (`entidad_Id`);

--
-- Indices de la tabla `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`medico_Id`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`paciente_Id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`usuario_Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `autorizacion`
--
ALTER TABLE `autorizacion`
  MODIFY `autorizacion_Id` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cita`
--
ALTER TABLE `cita`
  MODIFY `cita_Id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `consultorio`
--
ALTER TABLE `consultorio`
  MODIFY `consultorio_Id` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `entidad`
--
ALTER TABLE `entidad`
  MODIFY `entidad_Id` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `medico`
--
ALTER TABLE `medico`
  MODIFY `medico_Id` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `paciente_Id` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `usuario_Id` int(15) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cita`
--
ALTER TABLE `cita`
  ADD CONSTRAINT `cita_ibfk_1` FOREIGN KEY (`cita_Medico_Id`) REFERENCES `medico` (`medico_Id`),
  ADD CONSTRAINT `cita_ibfk_2` FOREIGN KEY (`cita_Autorizacion_Id`) REFERENCES `autorizacion` (`autorizacion_Id`),
  ADD CONSTRAINT `cita_ibfk_3` FOREIGN KEY (`cita_Entidad_Id`) REFERENCES `entidad` (`entidad_Id`),
  ADD CONSTRAINT `cita_ibfk_4` FOREIGN KEY (`cita_Consultorio_Id`) REFERENCES `consultorio` (`consultorio_Id`),
  ADD CONSTRAINT `prueba4` FOREIGN KEY (`cita_Paciente_Id`) REFERENCES `paciente` (`paciente_Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
