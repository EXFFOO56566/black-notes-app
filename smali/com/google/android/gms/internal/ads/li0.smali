.class public final Lcom/google/android/gms/internal/ads/li0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lcom/google/android/gms/internal/ads/nz;

.field private final c:Lcom/google/android/gms/internal/ads/za0;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/nz;Lcom/google/android/gms/internal/ads/za0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/li0;->a:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/li0;->c:Lcom/google/android/gms/internal/ads/za0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/li0;->b:Lcom/google/android/gms/internal/ads/nz;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/ws;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li0;->c:Lcom/google/android/gms/internal/ads/za0;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/za0;->a(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li0;->c:Lcom/google/android/gms/internal/ads/za0;

    new-instance v1, Lcom/google/android/gms/internal/ads/oi0;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/oi0;-><init>(Lcom/google/android/gms/internal/ads/ws;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/li0;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/j90;->a(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li0;->c:Lcom/google/android/gms/internal/ads/za0;

    new-instance v1, Lcom/google/android/gms/internal/ads/ni0;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/ni0;-><init>(Lcom/google/android/gms/internal/ads/ws;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/li0;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/j90;->a(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li0;->c:Lcom/google/android/gms/internal/ads/za0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/li0;->b:Lcom/google/android/gms/internal/ads/nz;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/li0;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/j90;->a(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li0;->b:Lcom/google/android/gms/internal/ads/nz;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/nz;->a(Lcom/google/android/gms/internal/ads/ws;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/ri0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/ri0;-><init>(Lcom/google/android/gms/internal/ads/li0;)V

    const-string v1, "/trackActiveViewUnit"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/ws;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/qi0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/qi0;-><init>(Lcom/google/android/gms/internal/ads/li0;)V

    const-string v1, "/untrackActiveViewUnit"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/ws;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    return-void
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/ws;Ljava/util/Map;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/li0;->b:Lcom/google/android/gms/internal/ads/nz;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/nz;->j()V

    return-void
.end method

.method final synthetic b(Lcom/google/android/gms/internal/ads/ws;Ljava/util/Map;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/li0;->b:Lcom/google/android/gms/internal/ads/nz;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/nz;->l()V

    return-void
.end method
