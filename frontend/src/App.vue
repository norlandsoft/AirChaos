<template>
  <div id="app">
    <nav class="navbar">
      <div class="nav-container">
        <div class="nav-logo">
          <h1>AirChaos</h1>
        </div>
        <div class="nav-menu">
          <a href="#" class="nav-link">首页</a>
          <a href="#" class="nav-link">功能</a>
          <a href="#" class="nav-link">关于</a>
        </div>
      </div>
    </nav>
    
    <main class="main-content">
      <div class="hero-section">
        <h2>欢迎使用 AirChaos</h2>
        <p>一个强大的现代化应用平台</p>
        <button class="cta-button">开始使用</button>
      </div>
      
      <div class="features-section">
        <div class="feature-card">
          <h3>功能一</h3>
          <p>描述功能一的详细信息</p>
        </div>
        <div class="feature-card">
          <h3>功能二</h3>
          <p>描述功能二的详细信息</p>
        </div>
        <div class="feature-card">
          <h3>功能三</h3>
          <p>描述功能三的详细信息</p>
        </div>
      </div>
    </main>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

#app {
  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  min-height: 100vh;
  background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
}

.navbar {
  background: rgba(255, 255, 255, 0.95);
  backdrop-filter: blur(10px);
  box-shadow: 0 2px 20px rgba(0, 0, 0, 0.1);
  position: fixed;
  top: 0;
  width: 100%;
  z-index: 1000;
}

.nav-container {
  max-width: 1200px;
  margin: 0 auto;
  padding: 0 20px;
  display: flex;
  justify-content: space-between;
  align-items: center;
  height: 70px;
}

.nav-logo h1 {
  color: #667eea;
  font-size: 24px;
  font-weight: bold;
}

.nav-menu {
  display: flex;
  gap: 30px;
}

.nav-link {
  text-decoration: none;
  color: #2c3e50;
  font-weight: 500;
  transition: color 0.3s ease;
}

.nav-link:hover {
  color: #667eea;
}

.main-content {
  padding-top: 70px;
  min-height: calc(100vh - 70px);
}

.hero-section {
  text-align: center;
  padding: 80px 20px;
  color: white;
}

.hero-section h2 {
  font-size: 48px;
  margin-bottom: 20px;
  font-weight: 300;
}

.hero-section p {
  font-size: 20px;
  margin-bottom: 40px;
  opacity: 0.9;
}

.cta-button {
  background: rgba(255, 255, 255, 0.2);
  border: 2px solid white;
  color: white;
  padding: 15px 40px;
  font-size: 18px;
  border-radius: 50px;
  cursor: pointer;
  transition: all 0.3s ease;
  backdrop-filter: blur(10px);
}

.cta-button:hover {
  background: white;
  color: #667eea;
  transform: translateY(-2px);
}

.features-section {
  max-width: 1200px;
  margin: 0 auto;
  padding: 80px 20px;
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
  gap: 40px;
}

.feature-card {
  background: rgba(255, 255, 255, 0.95);
  padding: 40px;
  border-radius: 20px;
  text-align: center;
  box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
  transition: transform 0.3s ease;
}

.feature-card:hover {
  transform: translateY(-10px);
}

.feature-card h3 {
  color: #667eea;
  font-size: 24px;
  margin-bottom: 20px;
}

.feature-card p {
  color: #666;
  line-height: 1.6;
}

@media (max-width: 768px) {
  .hero-section h2 {
    font-size: 36px;
  }
  
  .hero-section p {
    font-size: 18px;
  }
  
  .features-section {
    grid-template-columns: 1fr;
    padding: 40px 20px;
  }
}
</style>
