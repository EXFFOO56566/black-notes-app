.class final synthetic Lcom/google/android/gms/internal/ads/v40;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/xk1;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/fo;

.field private final c:Lcom/google/android/gms/internal/ads/zd1;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/zd1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/v40;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/v40;->b:Lcom/google/android/gms/internal/ads/fo;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/v40;->c:Lcom/google/android/gms/internal/ads/zd1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v40;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/v40;->b:Lcom/google/android/gms/internal/ads/fo;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/v40;->c:Lcom/google/android/gms/internal/ads/zd1;

    check-cast p1, Lcom/google/android/gms/internal/ads/id1;

    new-instance v3, Lcom/google/android/gms/internal/ads/xl;

    invoke-direct {v3, v0}, Lcom/google/android/gms/internal/ads/xl;-><init>(Landroid/content/Context;)V

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/id1;->y:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/xl;->c(Ljava/lang/String;)V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/id1;->z:Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/xl;->d(Ljava/lang/String;)V

    iget-object p1, v1, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/xl;->b(Ljava/lang/String;)V

    iget-object p1, v2, Lcom/google/android/gms/internal/ads/zd1;->f:Ljava/lang/String;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/xl;->a(Ljava/lang/String;)V

    return-object v3
.end method
