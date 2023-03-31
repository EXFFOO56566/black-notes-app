.class final synthetic Lcom/google/android/gms/internal/ads/fr0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/dr0;

.field private final b:Lcom/google/android/gms/internal/ads/kr0;

.field private final c:Lcom/google/android/gms/internal/ads/zf;

.field private final d:Lcom/google/android/gms/internal/ads/ln1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/dr0;Lcom/google/android/gms/internal/ads/kr0;Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/ln1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fr0;->a:Lcom/google/android/gms/internal/ads/dr0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fr0;->b:Lcom/google/android/gms/internal/ads/kr0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/fr0;->c:Lcom/google/android/gms/internal/ads/zf;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/fr0;->d:Lcom/google/android/gms/internal/ads/ln1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fr0;->a:Lcom/google/android/gms/internal/ads/dr0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fr0;->b:Lcom/google/android/gms/internal/ads/kr0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/fr0;->c:Lcom/google/android/gms/internal/ads/zf;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/fr0;->d:Lcom/google/android/gms/internal/ads/ln1;

    check-cast p1, Lcom/google/android/gms/internal/ads/ar0;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/google/android/gms/internal/ads/dr0;->a(Lcom/google/android/gms/internal/ads/kr0;Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/ln1;Lcom/google/android/gms/internal/ads/ar0;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
