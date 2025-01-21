import pygame

# Inicializa o Pygame
pygame.init()

# Define as dimensões da janela
largura, altura = 800, 600
tela = pygame.display.set_mode((largura, altura))
pygame.display.set_caption("Simulador de Robô")

# Define as cores
branco = (255, 255, 255)
preto = (0, 0, 0)
vermelho = (255, 0, 0)

# Define a posição inicial do robô
x, y = 400, 300

# Loop principal do jogo
rodando = True
while rodando:
    for evento in pygame.event.get():
        if evento.type == pygame.QUIT:
            rodando = False

    # Limpa a tela
    tela.fill(branco)

    # Desenha o robô (um círculo vermelho)
    pygame.draw.circle(tela, vermelho, (x, y), 10)

    # Atualiza a tela
    pygame.display.flip()